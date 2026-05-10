<h1 align="center">☕ Java Basics — Quick Reference Guide</h1>
<p align="center"><b>Developed By: James Gosling</b></p>
<p align="center"><i>JVM = Java Virtual Machine | JDK = Java Development Kit</i></p>

<hr>

<h2>🧩 Data Types in Java</h2>
<p>There are 2 types of Data Types in Java:</p>
<ol>
  <li><b>Primitive:</b> int, char, float, boolean, byte, short, long, double</li>
  <li><b>Non-Primitive:</b> String, Arrays, Classes, Interfaces</li>
</ol>

<hr>

<h2>🔄 Type Conversion & Type Casting</h2>
<pre><code>
// Type Conversion (Implicit)
byte b = 127;
int a = b;

// Type Casting (Explicit)
int x = 12;
byte y = (byte)x;

// Type Promotion
byte p = 10;
byte q = 30;
int result = p * q;
</code></pre>

<hr>

<h2>🧮 Operators in Java</h2>

<h3>1️⃣ Arithmetic Operators</h3>
<p><code>+ , - , * , /</code></p>
<pre><code>
num++;   // Post Increment
num--;   // Post Decrement
++num;   // Pre Increment
--num;   // Pre Decrement
</code></pre>

<h3>2️⃣ Relational Operators</h3>
<p><code>&gt; , &lt; , == , != , &lt;= , &gt;=</code></p>

<h3>3️⃣ Assignment Operators</h3>
<p><code>= , += , -= , *= , /=</code></p>

<h3>4️⃣ Logical Operators</h3>
<ul>
  <li><b>AND (&&)</b>: Returns <code>true</code> only if both conditions are true.</li>
  <li><b>OR (||)</b>: Returns <code>true</code> if any one condition is true.</li>
</ul>

<hr>

<h2>🔀 Conditional Statements</h2>
<p>Used for decision making.</p>
<p><b>Refer:</b> <code>condition.java</code></p>

<pre><code>
if (n % 2 == 0) {
  System.out.println("Even");
} else {
  System.out.println("Odd");
}
</code></pre>

<h3>🌟 Ternary Operator</h3>
<pre><code>
result = (n % 2 == 0) ? 10 : 20;
// if n%2==0 → 10 else → 20
</code></pre>

<h3>💡 Switch Statement</h3>
<p><b>Refer:</b> <code>switchcase.java</code></p>
<pre><code>
int day = 3;
switch (day) {
  case 1: System.out.println("Monday"); break;
  case 2: System.out.println("Tuesday"); break;
  case 3: System.out.println("Wednesday"); break;
  default: System.out.println("Invalid");
}
</code></pre>

<hr>

<h2>🔁 Loops in Java</h2>
<p>Used to perform an operation repeatedly.</p>
<p><b>Refer:</b> <code>loop.java</code></p>

<ol>
  <li><b>While Loop</b></li>
  <li><b>Do-While Loop</b></li>
  <li><b>For Loop</b></li>
  <li><b>For-Each Loop: We introduced it in oops chapter</b></li>
</ol>

<pre><code>
// Example
for (int i = 0; i &lt; 5; i++) {
  System.out.println(i);
}
</code></pre>

<hr>

<h2>⚙️ Functions / Methods</h2>
<p><b>Refer:</b> <code>function.java</code></p>
<p><b>Definition:</b> Function is a block of code which takes input and returns output.</p>

<pre><code>
return_type function_name(type arg1, type arg2) {
  // operations
  return result;
}
</code></pre>

<hr>

<h2>📘 Summary</h2>
<table border="1" cellspacing="0" cellpadding="6">
  <tr><th>Concept</th><th>File Reference</th></tr>
  <tr><td>Conditional Statements</td><td>condition.java</td></tr>
  <tr><td>Switch Statement</td><td>switchcase.java</td></tr>
  <tr><td>Loops</td><td>loop.java</td></tr>
  <tr><td>Functions</td><td>function.java</td></tr>
</table>

<hr>

<h3>❤️ Author</h3>
<p><b>Jibotosh Dey</b></p>
<p><i>Beginner-friendly Java Reference for Students & Developers</i></p>
