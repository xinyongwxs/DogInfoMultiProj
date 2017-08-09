var EventEmitter = require("events").EventEmitter;
var ActionTypes = require('../constants/AppConstants').ActionTypes;
import AppDispatcher from '../dispatcher/AppDispatcher';

var DogStore = Object.assign({}, EventEmitter.prototype, {
	loadDogData: function(data) {
		this.emitChange(data);
	}
	emitChange: function(param) {
		this.emit("change", param);
	},
	addChangeListener: function(callback) {
		this.on("change", param);
	},
	removeChangeListener: function(callback) {
		this.removeListener("change", callback);
	},
	dispatchToken: AppDispatcher.register(function(payload) {
		switch(payload.type) {
			case ActionTypes.LOAD_DOG_DATA:
				DogStore.loadDogData(payload.data);
			break;
		}
		return true;
	})
});

module.exports = DogStore;