import React from 'react';
import PanelHeader from "components/PanelHeader/PanelHeader.js";

const url = '/group/createGroup';
export default class MakeGroup extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            gName : "",
            gLimit : "",
            gDiscription : ""
        }
    }


    handleFormSubmit = (e) => {
        const tmpGName = this.state.gName;
        const tmpGLimit = this.state.gLimit;
        const tmpGDiscription = this.state.gDiscription;

        if(tmpGName === '') {
            alert("그룹명을 입력하세요.");
        }else if(tmpGLimit === ''){
            alert("그룹 최대 인원을 입력하세요.");
        }else if(tmpGDiscription === ''){
            alert("그룹 소개를 작성해주세요.");
        }else{
            const data = {
                gName : this.state.gName,
                gLimit : this.state.gLimit,
                gDiscription : this.state.gDiscription
            }
            fetch(url,{
                    method : "POST",
                    headers : {
                        'Content-type' : 'application/json'
                    },
                    body : JSON.stringify(data)
                }
            );
        }
    }

    handleValueChange = (e) => {
        let nextState = {};
        nextState[e.target.name] = e.target.value;
        this.setState(nextState);
    }

    render () {
        return (
            <>
            <PanelHeader size="sm" />
            <div class = "container"> 
                <div class = "form-group">
                    <form onSubmit={this.handleFormSubmit}>
                        <div>
                        <label>그룹명  </label>
                        <input type="text" name = "gName" class ="form-control" defaultValue={this.state.gName} onChange = {this.handleValueChange}/>
                        </div>
                        <div>
                        <label>그룹인원</label>
                        <input type="text" name = "gLimit" class ="form-control" defaultValue={this.state.gLimit} onChange = {this.handleValueChange}/>
                        </div>
                        <div>
                        <label>그룹소개</label>
                        <input type="text" name = "gDiscription" class ="form-control" defaultValue={this.state.gDiscription} onChange = {this.handleValueChange}/>
                        </div>
                        <button type="submit" class = "btn btn-primary">작성</button>
                    </form>
                </div>
            </div>
            </>
        )
    }
}