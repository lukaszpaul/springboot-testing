import React, { useState } from 'react'
import '../App.css';
import axios from 'axios'
import { useNavigate } from "react-router-dom";


function Signup() {

    const[email, setEmail] = useState('')
    const [password, setPassword] = useState('')

    const navigate = useNavigate();

    const handleAction = () => {

        const response = axios.post("http://localhost:8080/api/auth/login", {
            email: email,
            password: password
        })
        console.log(response)

     

    }

  return (
    <>
        <div className='center'>
            <h1 className='center'>Signup OR Login</h1>
            <br></br>
            <form>
                <text className='center'> Enter Email: &nbsp;</text>
                <input type="text" placeholder="Email" onChange={(e) => setEmail(e.target.value)}></input>
                <text>&nbsp;&nbsp;Enter Password: &nbsp;</text>
                <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)}></input>
            </form>
                <br></br>
            <div>
                <button onClick={handleAction()}>Login/Signup</button>
            </div>
        </div>

</>



    
  )
}

export default Signup