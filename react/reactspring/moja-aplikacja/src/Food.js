import React, { Component } from 'react';

class Food extends Component {



  render() {
    return (
      <div>
      <p>----------------</p>
      <p></p>
      <p>{this.props.info.type}</p>
      <p></p>
      </div>
    );
  }
}

export default Food;
