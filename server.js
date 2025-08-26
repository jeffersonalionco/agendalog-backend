import Express from 'express'
import sequelize from './api/db.js';
import cors from 'cors'
import authRoutes from './api/routes/authRoutes.js'

import { configDotenv } from 'dotenv';
configDotenv()


// Criando um instancia do express
const app = Express();
app.use(cors)
app.use(Express.json());

// Rotas de autenticação
app.use('/api/auth', authRoutes)



app.get("/", (req, res) => {
    res.send("Hello Mundo")
})



// Inicializando conexeção com o banco de dados postgresql
sequelize.authenticate()
.then((ev) => {
    console.log("Conexão com o banco realizado com sucesso");
    app.listen(3009, () => {
    console.log(`Servidor rodando em http://localhost:3009`)
})
})
.catch((err) => {
    console.log("Erro de conexção com o banco de dados" + err)
})
