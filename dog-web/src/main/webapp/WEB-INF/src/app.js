import overview from './components/overview';
import React from "react";
import { render } from "react-dom";

class App extends React.Component {
	constructor(props) {
		super(props);
	}

	componentDidMount() {
		
	}

	componentWillMount() {
		
	}

	componentDidMount() {
		
	}

	render() {
		return (<overview />);
	}
}

render(<App />, document.getElementById("root"));