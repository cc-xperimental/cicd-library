#!groovy

/**
 * Determines if a branch is master
 */
def call (string branchName) {
    return [
      'master', 'origin/master', 'refs/heads/master'
    ].contains(branchName)
}