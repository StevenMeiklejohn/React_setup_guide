import React from 'react';
import {render} from 'react-dom';
import AwesomeComponent from './components/AwesomeComponent.jsx';
import MessageComponent from './components/MessageComponent.jsx';
import BannerAdComponent from './components/BannerAdComponent.jsx';

class App extends React.Component {
  render () {
    return (
      <div>
      <p>Hello React!</p>
      <AwesomeComponent />
      <MessageComponent />
      <BannerAdComponent />
      </div>
      )
    }
};





window.onload = () => {
  render(<App/>, document.getElementById('app'));
};