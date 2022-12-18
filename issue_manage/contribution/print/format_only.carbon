// Part of the Carbon Language project, under the Apache License v2.0 with LLVM 
// Exceptions. See /LICENSE for license information. 
// SPDX-License-Identifier: Apache-2.0 WITH LLVM-exception 
// 
// AUTOUPDATE 
// RUN: %{explorer-run} 
// RUN: %{explorer-run-trace} 
// CHECK:STDOUT: issue_manage tool 
// CHECK:STDOUT: result: 0 
  
package IssueManage api; 

fn Main() -> i32 { 
  var s: auto = "issue_manage tool"; 
  Print(s); 
  return 0; 
}
