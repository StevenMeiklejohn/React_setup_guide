
import React from 'react';

class BoardComponent extends React.Component{

  constructor(props){
    super(props);
    this.state = {className : "board"};
    this.onPress = this.onPress.bind(this);
  }


  onPress(){
    console.log(this.state.className)
    if(this.state.className === "selectedBoard"){
      this.setState({className: "board"});
    } 
    console.log("2nd if", this.state.className);
    if(this.state.className === "board"){
    this.setState({className: "selectedBoard"});
    }
 
  }

  render() {
    return (
      <div>
      <button className={this.state.className} onClick={this.onPress}>Board Click</button>
      </div>
      );
  }

}

export default BoardComponent;
