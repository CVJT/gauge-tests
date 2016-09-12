package com.thoughtworks.gauge.test.common;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link ExecutionSummary} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ExecutionSummaryAssert extends AbstractAssert<ExecutionSummaryAssert, ExecutionSummary> {

  /**
   * Creates a new <code>{@link ExecutionSummaryAssert}</code> to make assertions on actual ExecutionSummary.
   * @param actual the ExecutionSummary we want to make assertions on.
   */
  public ExecutionSummaryAssert(ExecutionSummary actual) {

    super(actual, ExecutionSummaryAssert.class);
    as("Execute : gauge " + actual.getCommand());
  }

  /**
   * An entry point for ExecutionSummaryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myExecutionSummary)</code> and get specific assertion with code completion.
   * @param actual the ExecutionSummary we want to make assertions on.
   * @return a new <code>{@link ExecutionSummaryAssert}</code>
   */
  public static ExecutionSummaryAssert assertThat(ExecutionSummary actual) {
    return new ExecutionSummaryAssert(actual);
  }

  /**
   * Verifies that the actual ExecutionSummary's command is equal to the given one.
   * @param command the given command to compare the actual ExecutionSummary's command to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ExecutionSummary's command is not equal to the given one.
   */
  public ExecutionSummaryAssert hasCommand(String command) {
    // check that actual ExecutionSummary we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting command of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualCommand = actual.getCommand();
    if (!Objects.areEqual(actualCommand, command)) {
      failWithMessage(assertjErrorMessage, actual, command, actualCommand);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ExecutionSummary's stderr is equal to the given one.
   * @param stderr the given stderr to compare the actual ExecutionSummary's stderr to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ExecutionSummary's stderr is not equal to the given one.
   */
  public ExecutionSummaryAssert hasStderr(String stderr) {
    // check that actual ExecutionSummary we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting stderr of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualStderr = actual.getStderr();
    if (!Objects.areEqual(actualStderr, stderr)) {
      failWithMessage(assertjErrorMessage, actual, stderr, actualStderr);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ExecutionSummary's stdout is equal to the given one.
   * @param stdout the given stdout to compare the actual ExecutionSummary's stdout to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ExecutionSummary's stdout is not equal to the given one.
   */
  public ExecutionSummaryAssert hasStdout(String stdout) {
    // check that actual ExecutionSummary we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting stdout of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualStdout = actual.getStdout();
    if (!Objects.areEqual(actualStdout, stdout)) {
      failWithMessage(assertjErrorMessage, actual, stdout, actualStdout);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ExecutionSummary's success is equal to the given one.
   * @param success the given success to compare the actual ExecutionSummary's success to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ExecutionSummary's success is not equal to the given one.
   */
  public ExecutionSummaryAssert hasSuccess(boolean success) {
    // check that actual ExecutionSummary we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nCommand \"%s\" did not complete successfully.\nSTDOUT:\n%s\nSTDERR:\n%s";
    
    // check
    boolean actualSuccess = actual.getSuccess();
    if (actualSuccess != success) {
      failWithMessage(assertjErrorMessage, actual.getCommand(), actual.getStdout(), actual.getStderr());
    }

    // return the current assertion for method chaining
    return this;
  }

}