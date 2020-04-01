package com.codeborne.selenide.webdriver;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class BrowserArguments {

  private List<String> args = new ArrayList<>();

  public BrowserArguments addArguments(String... arguments) {
    addArguments(ImmutableList.copyOf(arguments));
    return this;
  }

  public BrowserArguments addArguments(List<String> arguments) {
    args.addAll(arguments);
    return this;
  }

  public List<String> getArgs() {
    return args;
  }

  @Override
  public String toString() {
    return StringUtils.join(args, " ");
  }
}
