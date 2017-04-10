var webpack = require('webpack');
var path = require('path');


var config = {
  entry: __dirname + "/src/index.jsx",
  output: {
    filename: "bundle.js",
    path: __dirname + "/build"
  },
  devtool: 'source-map',
  module:{
      rules: [{
        test: /\.jsx?$/,
        exclude: /(node_modules)/,
        loader: 'babel-loader',
        query: {
          presets: ['es2015', 'react']
        }
      }]
    }
}




module.exports = config;