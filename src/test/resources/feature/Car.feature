Feature: 車の燃料の補給
  運転手は、車を走らせるために、燃料を補給する必要がある。

Scenario: 燃料の補給
 Given 車のタンクには、10リットルの燃料が入っている
 When 運転手は、50リットルの燃料を補給した
 Then タンクには、60リットルの燃料が入っている