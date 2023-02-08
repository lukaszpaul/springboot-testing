import './App.css';
import Signup from './components/Signup';
import Menu from './components/Menu';
import Receipts from './components/Receipts';
import {Routes, Route} from "react-router-dom"

function App() {
  return (
   <>
   <Routes>
      <Route path="/" element={<Signup/>}/>
      <Route path="/menu" element={<Menu/>}/>
      <Route path="/receipts" element={<Receipts/>}/>
   </Routes>
   
   </>
  );
}

export default App;
