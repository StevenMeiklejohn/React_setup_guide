
import React from 'react';

// Create a component named MessageComponent
class BannerAdComponent extends React.Component{

  constructor(props){
    super(props);
    this.state = {message : "Johny5 is alive!"};
    this.onPress = this.onPress.bind(this);
  }

  onPress(){
    console.log("onPress triggered");
    let newMessage = "Your momma was a snow blower";
    this.setState({message: newMessage});
    console.log(this.state);

  }

  render() {
    return (
      <div>
      <button onClick={this.onPress}>Click here</button>
      <h1>{this.state.message}</h1>
      </div>
      );
  }

}

export default BannerAdComponent;
