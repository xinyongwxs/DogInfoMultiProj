const Dispatcher = require("flux").Dispatcher;
const dispatcher = new Dispatcher();
const _dipatch = dispatcher.dispatch;
dispatcher.dispatch = function(args) {
	_dipatch.apply(dispatcher, arguments);
};
export default dispatcher;