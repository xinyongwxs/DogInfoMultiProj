var path = require('path');

module.exports = {
    entry: './src/app.js',
    devtool: 'sourcemaps',
    cache: true,
    debug: true,
    output: {
        path: __dirname,
        filename: './dist/bundle.js'
    },
    module: {
        loaders: [
            {
                test: path.join(__dirname, '.'),
                loader: "babel", 
                query: {presets:['react','es2015']}
            },
            {
            	test: /\.css$/, 
            	loader: "bless"
            }
        ]
    }
};