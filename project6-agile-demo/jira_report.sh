#!/bin/bash

# Initialize counters
total_issues=0
open_issues=0
in_progress_issues=0
closed_issues=0

# Read the jira_issues.txt file line by line
while IFS='|' read -r issue_id summary description status; do
  # Increment total issues count
  ((total_issues++))

  # Check the status and increment the appropriate counter
  case "$status" in
    Open)
      ((open_issues++))
      ;;
    "In Progress")
      ((in_progress_issues++))
      ;;
    Closed)
      ((closed_issues++))
      ;;
  esac
done < jira_issues.txt

# Print the summary report
echo "Total Number of Issues: $total_issues"
echo "Open Issues: $open_issues"
echo "In Progress Issues: $in_progress_issues"
echo "Closed Issues: $closed_issues"