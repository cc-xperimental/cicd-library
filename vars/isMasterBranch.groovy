#!groovy

/**
 * Determines if a branch is master
 */
def call (String branchName) {
    return [
      'master', 'origin/master', 'refs/heads/master'
    ].contains(branchName)
}