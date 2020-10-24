import React from 'react';
import logo from './logo.svg';
import './App.css';
import Login from './Components/Login';
import Nav from './Navigation/Nav';
import {BrowserRouter as Router, Route, Link} from 'react-router-dom';

function App() {
  const HelloApp = () => 
  ( 
    <div> 
      <h1>테스트</h1>
      <a href="/login">로그인</a> 
    </div> )
    

  return (
    <Router>
       <Nav />
      <div>
          <Route exact path='/' component={HelloApp} />
          <Route path='/login' component={Login} />
      </div>
    </Router>
    
    
  );

 

}

export default App;