#!/bin/bash

# Check if json-server is installed
if ! command -v json-server &> /dev/null
then
    echo "json-server could not be found. Please install it using npm install -g json-server"
    exit
fi

# Start json-server on port 3000 with db.json
json-server --watch db.json --port 3000