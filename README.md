## Encapsulation Challenge

### Description

You need to create a class named <b>Printer</b>. The fields on this class are going to be:

<ul>
<li><b>tonerLevel</b>, which is the percentage of how much toner level is left.</li>
<li><b>pagesPrinted</b>, which is the count of total pages printed by the <b>Printer</b>.</li>
<li><b>duplex</b>, which is a <b>boolean</b> indicator. If <b>true</b>, it can print on 2 sides of a single sheet of paper.</li>
</ul>

On the <b>Printer</b> class, you want to create two methods, which the calling code should be able to access. These methods are:

1. <b>addToner</b>, which takes a <b>tonerAmount</b> argument. <b>tonerAmount</b> is added to the <b>tonerLevel</b> field. The <b>tonerLevel</b> should never exceed 100 percent, or ever get below 0 percent. If the amount being added makes the level fall outside that range, return -1.

2. <b>printPages</b>, which should take <b>pages</b> to be printed as an argument. It should determine how many sheets of paper, will be printed based on the <b>duplex</b> value. The sheet number should be added to the <b>pagesPrinted</b> variable. If it's a <b>duplex</b> printer, print a message that it's a duplex printer.
