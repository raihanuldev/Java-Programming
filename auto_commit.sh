#!/bin/bash

# Navigate to your project directory
cd /d/Development/Java\ Programming/Java\ Programming

# Check for changes
if [[ `git status --porcelain` ]]; then
  # Add changes to git
  git add .

  # Commit changes with a timestamp message
  git commit -m "Code Updated"

  # Push changes to the repository
  git push origin main
fi
