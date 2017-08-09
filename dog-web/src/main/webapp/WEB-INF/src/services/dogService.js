import client from './client';

export default {
	getDogByFilter: function(pathName, limit, offset, filter, orderByName, sortMethod) {
		var relativePathStr = "/" + pathName + "/filtered";
		var filterEntity = {
			limit: limit,
			offset: offset,
			filter: filter,
			orderByName: orderByName,
			sortMethod: sortMethod
		}

		var promise = client({
			method: 'POST',
			path: "/" + pathName,
			entity: filterEntity,
			headers: {'Content-Type': 'application/json'}
		});

		return promise;
	},
	getAllDogs: function(pathName) {
		var relativePathStr = "/" + pathName;
		var promise = client({
			method: 'GET',
			path: relativePathStr
		});
		return promise;
	}
}