shell
#!/bin/bash

# Display the Git history using git log
git log --pretty=format:"%h - %an, %ad : %s" --date=short