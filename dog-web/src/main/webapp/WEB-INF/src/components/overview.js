import React from "react";
import { render } from "react-dom";
import ReactTable from "react-table";
import "react-table/react-table.css";
import DogStore from "./stores/DogStore";


export default class overview extends React.Component {
	constructor() {
		super();
		this.state = {
			data: null
		};

	}

	renderEditable(cellInfo) {
		return (
			<div
				style={{ backgroundColor: "#fafafa" }}
		        contentEditable
		        suppressContentEditableWarning 
		        onBlur={e => {
		        	const data = [...this.state.data];
		        	data[cellInfo.index][cellInfo.column.id] = e.target.innerHTML;
		        	this.setState({ data });
		        }}
		        datngerouslySetInnerHTML={{
		        	__html: this.state.data[cellInfo.index][cellInfo.column.id]
		        }}
		    />
		);
	}

	componentDidMount() {
		
	}

	componentWillMount() {
		DogStore.addChangeListener(this.handleDogData.bind(this));
	}

	handleDogData(data) {
		var currState = Object.assign({}, this.state);
		currState.data = data;
		this.setState(currState);
	}

	render() {
		const { data } = this.state;
		return (
			<div>
				<ReactTable
					data={data}
					column={[
			            {
			              Header: "First Name",
			              accessor: "firstName",
			              Cell: this.renderEditable
			            },
			            {
			              Header: "Last Name",
			              accessor: "lastName",
			              Cell: this.renderEditable
			            },
			            {
			              Header: "Full Name",
			              id: "full",
			              accessor: d =>
			                <div
			                  dangerouslySetInnerHTML={{
			                    __html: d.firstName + " " + d.lastName
			                  }}
			                />
			            }
			        ]}
			        defaultPageSize={10}
			        className="-striped -highlight"
				/>
			</div>
		);
	}
}

