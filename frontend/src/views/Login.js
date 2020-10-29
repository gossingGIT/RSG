import React from 'react';
// core components
import PanelHeader from "components/PanelHeader/PanelHeader.js";
import './Login.scss';

const url = '/user/verifyLogin';
export default class Login extends React.Component {
  
    constructor(props) {
        super(props);
        this.state = {
            uid : "",
            upw : ""
        }
    }


    handleFormSubmit = (e) => {

        const tmpId = this.state.uid;
        const tmpPw = this.state.upw;

        if (false) {
            alert("아이디, 비밀번호를 입력하여 주십시오.");
        }
        else {
            const data = {
                uid : this.state.uid,
                upw : this.state.upw
            }
            fetch(url,{
                method : "POST",
                headers : {
                 'Content-type' : 'application/json'
                },
                body : JSON.stringify(data)
            });
        }
       
    }


    handleValueChange = (e) => {
        let nextState = {};
        nextState[e.target.name] = e.target.value;
        this.setState(nextState);
    }

    render () {
        const {isOpen,close} = this.props;
        return (
        <>

        {
        isOpen ? (
            <div class="modal_1">
                <div class ="loginModal">
                    <span onClick={close} id = "closeIcon">X</span> 
                     <div class = "form-group">
                        <form onSubmit={this.handleFormSubmit}>
                            <div>
                                <label>ID  </label>
                                <input type="text" name = "uid" class ="form-control" defaultValue={this.state.uid} onChange = {this.handleValueChange}/>    
                            </div>
                            <div>
                                <label>PWD</label>
                                <input type="password" name = "upw" class ="form-control" defaultValue={this.state.upw} onChange = {this.handleValueChange}/>
                            </div>
                                <button type="submit" class = "btn btn-Primary">로그인</button>
                                <button type="submit" class = "btn btn-warning">회원가입</button>
                            </form>
                    </div>
                </div>
            </div>     
        ) : null}
        </>   
        )
    }
}