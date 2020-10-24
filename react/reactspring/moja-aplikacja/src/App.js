import React, { Component } from 'react';
import Modal from 'react-modal';
import { useState } from 'react';
import Food from "./Food";
import Kitchen from "./Kitchen";
import "./App.css";
import ModalW from "./ModalW";
import { getByTitle } from '@testing-library/react';
class App extends React.Component {

	constructor(props) {
		super(props);
this.state =
{
  modalIsOpen: false,
  setModalIsOpen: false,
  data: [],
  isLoading: true,
  dataFood: [],
}

   }
	componentDidMount() {
		this.setState({ isLoading: true });
		fetch('http://localhost:8080/api/kitchen/all')
		  .then(response => response.json())
		.then(result => { 
			this.setState({data: result, isLoading: false})	
	});
	
	fetch('http://localhost:8080/api/all')
	  .then(response => response.json())
	.then(result => { 
		this.setState({dataFood: result})	
});

	  }
  render() {


	const {modalIsOpen} =this.state;
	const {data, isLoading} = this.state;
	if (isLoading) {
		return <p>Loading ...</p>;
	  }
	  else{
		const Italian = Object.values(this.state.data[0])[1];
		const American = Object.values(this.state.data[1])[1];
		const Chinese = Object.values(this.state.data[2])[1];
		const Spanish = Object.values(this.state.data[3])[1];
		const Japanese = Object.values(this.state.data[4])[1];
		const Polish = Object.values(this.state.data[5])[1];
		const German = Object.values(this.state.data[6])[1];
		const Vege = Object.values(this.state.data[7])[1];
    return (
		
    <div id="mainbox" className="mainbox">
		<hh className="hh">Don't you know what to order?</hh>
		<div id="box" className="box">
		
			<div className="box1">
			

				<span className="span1"> <b>{Italian}</b></span>
				<span className="span2"><b>{American}</b></span>
				<span className="span3"><b>{Chinese}</b></span>
				<span className="span4"><b>{Spanish}</b></span>
			</div>
			
			<div className="box2">
				<span className="span1"><b>{Japanese}</b></span>
				<span className="span2"><b>{Polish}</b></span>
				<span className="span3"><b>{German}</b></span>
				<span className="span4"><b>{Vege}</b></span>
			</div>
		</div>

		<button className="spin" onClick={myfunction}>SPIN</button>

		<div >
		<tb>
		<button className="tb" onClick={()=> {this.setState({modalIsOpen:true})
	
	 console.log(modalIsOpen);}}>Propositions</button>	
		</tb>
		<Modal isOpen={modalIsOpen}>
			<h2>Propositions</h2>
	 <p>{this.state.dataFood.map(food => <Food info={food}/>)}</p>
			
		<br></br>
		
			<button className="bt" onClick={()=> this.setState({modalIsOpen:false})}>Back</button>
			
			</Modal>
			</div>
			

	</div>

		



    );
  }
}

}
/*
{this.state.dataFood.filter(p => p.kitchen=='Italian').map(food => <Food info={food}/>)}
		
*/

















function myfunction(){

	var x = 1024; // min value
	var y = 9999; // max value

	var deg = Math.floor(Math.random() * (x - y)) + y;

	document.getElementById('box').style.transform = "rotate("+deg+"deg)";

	var element = document.getElementById('mainbox');
	element.classList.remove('animate');
	setTimeout(function(){
		element.classList.add('animate');
	}, 5000); // 5000 = 5 second

}

export default App;
