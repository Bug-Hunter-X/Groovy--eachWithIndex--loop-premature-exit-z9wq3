# Groovy `eachWithIndex` Loop Premature Exit

This example demonstrates a common error when using the `eachWithIndex` method in Groovy.  Improper use of the `return` statement within the closure can lead to the loop terminating earlier than expected. The `return` statement exits the loop completely rather than just the current iteration.