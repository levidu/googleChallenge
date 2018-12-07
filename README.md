# googleChallenge
You were browsing a list of users registered on your site when you noticed that some email address might be duplicated. 

You were browsing a list of users registered on your site when you noticed that some email address might be duplicated.   Every address consists of a local name and domain name, separated by the @ sign. For example, in the address ”duplicate@example.com”, “duplicate” is a local name and “example.com“ is a domain name.   For the purposes of this task, let’s define two ways of formatting an email address:

- [* ] If you add dots (‘.’) between some characters in the local name part of an email address, it will be forwarded to the equivalent address without dots. For instance, email addresses of the form “dupli.cate@example.com”, “duplicating…cate@example.com” will all be forwarded to “duplicate@exmaple.com”. Please note that this doesn’t work for domain names, so “duplicate@exa.mple.com.net” is different from “duplicate@example.com.net”;
- [*] If you add a plus (‘+’) in the local name, everything after the plus sign will be ignored. This allows certain emails to be filtered; for example, “duplicate+work@example.com” will be forwarded to “duplicate@example.com”

It is possible to use both of these formatting methods at the same time.

You are given a list of addresses. We collect them together into groups, with each group containing emails that are equivalent according to the above rules. For example, given  L= [“a.b@example.com", "x@example.com", "x@exa.mple.com","ab+1@example.com","y@example.com","y@example.com","y@example.com”]. Your goal is to find the number of group[s which contain more than one element - in this example, there are two such groups.

Write a function: 

Class Solution {public int solution (String[] L);}

That given a list of emails L, will return the number of groups whose length is greater than one. 

