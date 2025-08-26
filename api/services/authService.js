import bcrypt from  "bcrypt";
import jwt from   "jsonwebtoken";
import userRepository from "../repositories/userRepository.js";


const SECRET = process.env.JWT_SECRET || "OceuElindo"

const login =  async (email, senha) => {
    const user = await userRepository.findByEmail(email);
    if(!user) throw new Error("Usuario não encontrado");

    // comparar senhas enviada com a do banco de dados
    const isPasswordValid = senha === user.senha
    if(!isPasswordValid) throw new Error("Senha Invalida");


    // gerar token JWT 
    const token = jwt.sign(
        {
            id: user.id, email: user.email
        },
        SECRET,
        {
            expiresIn: '3m'
        }
        
    );

    return { token, user: { id: user.id, email: user.email }}

}


export default { login }
