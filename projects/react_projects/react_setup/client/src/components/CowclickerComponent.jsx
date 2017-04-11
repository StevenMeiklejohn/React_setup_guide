import React from 'react';

class CowClickerComponent extends React.Component {

  constructor(props){
    super(props);
    this.state = {clicks : 0};
    this.onClick = this.onClick.bind(this);
  }

  onClick(){
    let newClickCount = this.state.clicks + 1;
    this.setState({clicks: newClickCount});
  }

  render(){
    return (
      <div>
        <div>
          Clicks: {this.state.clicks}
        </div>
        <img
          src="http://s3.bypaulshen.com/buildwithreact/cow.png"
          onClick={this.onClick}
          className="cow"
        />
        <p>Click the cow</p>
      </div>
  )}
}
export default CowClickerComponent;


