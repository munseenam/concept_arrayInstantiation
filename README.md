 <h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="ARRAY_0"></a>ARRAY</h1>
<p class="has-line-data" data-line-start="2" data-line-end="3">Java arrays are, in fact, variables that allow you to store more than one values of the same data type and call any of them whenever you need.</p>

<details><summary>
 CHARACTERISTICS OF A JAVA ARRAY</p>
<ul></ul></summary><br/>
<li class="has-line-data" data-line-start="6" data-line-end="7">Java arrays are case-sensitive.</li>
<li class="has-line-data" data-line-start="7" data-line-end="8">zero-based (the first index is not 1 but 0).</li>
<li class="has-line-data" data-line-start="8" data-line-end="9">Java arrays can only contain elements of the same data type.</li>
<li class="has-line-data" data-line-start="9" data-line-end="10">For instance, you can have an integer array or a string array but not a mixed one that contains both strings and integers.</li>
<li class="has-line-data" data-line-start="10" data-line-end="11">you also need to define the size of the array before passing it to the compiler.</li>
</ul>
</details>
<br/>
 <details><summary>DECLARE A NEW JAVA ARRAY</summary></br>
As Java arrays can only contain elements of the same type, you need to define which data type it will use when you declare a new array. You can use either primitive data types such as integers, floats, or booleans or objects such as strings and dates. As the Array object is also one of Java’s built-in objects, you can also store arrays within an array. This kind of arrays are called multi-dimensional arrays.<br>
An array declaration, in fact, is a blueprint of which you will create an instance during the next step (called instantiation).</p>

### INITIALIZE THE ARRAY 
<p class="has-line-data" data-line-start="20" data-line-end="22">When you initialize an array, you define a value for each of its elements.<br>
import java.util.Arrays;</p>
<h4 class="code-line" data-line-start=23 data-line-end=24 ><a id="Example_23"></a>Example:</h4>
<pre><code class="has-line-data" data-line-start="25" data-line-end="40">public class MyClass {
   public static void main(String[] args) {
      String[] myArray = new String[6];

      myArray[0] =  "Mark Twain"';
      myArray[1] = "Virginia Woolf";
      myArray[2] = "William Shakespeare";
      myArray[3] = "Maya Angelou";
      myArray[4] = "Charles Dickens";
      myArray[5] = "Agatha Christie";
 
      System.out.println(Arrays.toString(myArray));
}
}
</code></pre>

 
 ### USE THE INITIALIZATION SHORTHAND<br>
If you don’t want to type that much you can also perform the three aforementioned steps (declaration, instantiation, initialization) in one step using the following shorthand syntax.</p>
<h4 class="code-line" data-line-start=43 data-line-end=44 ><a id="Example_43"></a>Example:</h4>
<pre><code class="has-line-data" data-line-start="45" data-line-end="59">/* Initialization shorthand */
import java.util.Arrays;

public class MyClass {
public static void main(String[] args) {

       String[] myArray = {"Mark Twain&quot","Virginia Woolf&quot","William Shakespeare","Maya Angelou", 
            "Charles Dicken","Agatha Christie"};
       
       System.out.println(Arrays.toString(myArray));
}
}
</code></pre>
</details>
