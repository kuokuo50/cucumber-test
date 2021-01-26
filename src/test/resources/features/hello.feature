Feature: 問候
  這是一個測試問候語，傳入字串XXX，系統會回應你說Hi~XXX

  Scenario: 問候 1
    Given 測試問候語 "Hello"
    When 我說你好
    Then 我收到 "Hi~Hello"
    
  Scenario: 問候 2 
    Given 測試問候語 "使用者"
    When 我說你好
    Then 我收到 "Hi~使用者"
    
  Scenario Outline: 問候 3 
    Given 測試問候語 "<輸入>"
    When 我說你好
    Then 我收到 "<輸出>"
  
  Examples:
  	| 輸入            | 輸出       |
    | Hello          | Hi~Hello   |
    | 中文            | Hi~中文    |
    |                | Hi~        | 	