import React from 'react';

// Create a component named MessageComponent
class MessageComponent extends React.Component{

  constructor(props){
    super(props);
    this.message = "Wouldn't you like to be a pepper too?";
  }

  render() {
    return (
      <h1>{this.message}</h1>
      );
  }

}

export default MessageComponent;

