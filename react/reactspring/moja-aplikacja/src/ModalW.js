import React from 'react';
import Modal from 'react-modal';


  function ModalW(){

    var modalIsOpen=true;

    return(
      <div className="ModalW">	
      
      <Modal isOpen={modalIsOpen}>
        <h2>title</h2>
    <p>title2</p>
        <div>
        <button onClick={()=> modalIsOpen=false}>close</button>	
        </div>
        </Modal>
  
      </div>
    );
  }

export default ModalW;
