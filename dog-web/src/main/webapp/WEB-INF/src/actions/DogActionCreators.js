import AppDispatcher from "../dispatcher/AppDispatcher";
import AppConstants from "../constants/AppConstants";
import DogStore from "../stores/DogStore";
import DogService from "../services/DogService";

const ActionTypes = AppConstants.ActionTypes;

export default {
	getDogData: function(content) {
		return DogService.getAllDogs().done(function(allDogs) {
			AppDispatcher.dispatch({
				type: ActionTypes.LOAD_DOG_DATA,
				data: {
					dogType: content,
					allDogs: allDogs
				}
			});
		});

	}
}