package com.github.daggerok.vaadin;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

class ApplicationTest {

  @Test
  void test() {
    // given
    Selenide.open("http://127.0.0.1:8080");
    // when
    $("vaadin-button[role='button']")
        // then
        .shouldBe(Condition.exist)
        // and when
        .click();
    $("vaadin-notification-card[aria-label='Hello anonymous user']")
        // then
        .shouldBe(Condition.exist);
  }
}
