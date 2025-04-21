#!/bin/bash

# Find the process ID (PID) listening on port 3000
PID=$(lsof -t -i:3000)

# Check if a process was found
if [ -n "$PID" ]; then
  echo "Process found with PID: $PID"
  # Kill the process
  kill $PID
  echo "Process with PID $PID has been terminated."
else
  echo "No process found listening on port 3000."
fi