package com.dicoding.fauzimaulana.programminglanguageinfo.model

import com.dicoding.fauzimaulana.programminglanguageinfo.R

object LanguageData {
    private val languageLogo = intArrayOf(
        R.drawable.kotlin,
        R.drawable.java,
        R.drawable.python,
        R.drawable.php,
        R.drawable.ruby,
        R.drawable.golang,
        R.drawable.js,
        R.drawable.clang,
        R.drawable.cplus,
        R.drawable.csharp
    )

    private val languageName = arrayOf(
        "Kotlin",
        "Java",
        "Python",
        "PHP",
        "Ruby",
        "Go",
        "JavaScript",
        "C",
        "C++",
        "C#"
    )

    private val languageRelease = arrayOf(
        "2016",
        "1996",
        "1991",
        "1995",
        "1995",
        "2012",
        "1993",
        "1973",
        "1985",
        "2000"
    )

    private val languageDesignedBy = arrayOf(
        "JetBrains",
        "James Gosling",
        "Guido van Rossum",
        "Rasmus Lerdorf",
        "Yukihiro Matsumoto",
        "Robert Griesemer, Rob Pike, and Ken Thompson",
        "Brendan Eich of Netscape initially",
        "Dennis Ritchie",
        "Bjarne Stroustrup",
        "Microsoft"
    )

    private val languageDeveloper = arrayOf(
        "JetBrains",
        "Oracle Corporation",
        "Python Software Foundation",
        "The PHP Development Team",
        "Yukihiro Matsumoto",
        "The Go Authors",
        "Brendan Eich of Netscape initially",
        "Dennis Ritchie and Bell Labs",
        "ISO/IEC JTC1",
        "Microsoft"
    )

    private val languageWebsite = arrayOf(
        "www.kotlinlang.org",
        "www.oracle.com/java/",
        "www.python.org",
        "www.php.net",
        "www.ruby-lang.org",
        "www.golang.org",
        "www.ecma-international.org",
        "www.iso.org",
        "www.isocpp.org",
        "www.docs.microsoft.com/en-us/dotnet/csharp/"
    )

    private val languageDescription = arrayOf(
        "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise. \nKotlin mainly targets the JVM, but also compiles to JavaScript (e.g., for frontend web applications using React) or native code (via LLVM); e.g., for native iOS apps sharing business logic with Android apps. Language development costs are borne by JetBrains, while the Kotlin Foundation protects the Kotlin trademark.",
        "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. \nThe syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers.",
        "Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.Python is dynamically-typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.",
        "PHP is a general-purpose scripting language geared towards web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by The PHP Group. PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor. \nPHP code is usually processed on a web server by a PHP interpreter implemented as a module, a daemon or as a Common Gateway Interface (CGI) executable. On a web server, the result of the interpreted and executed PHP code – which may be any type of data, such as generated HTML or binary image data – would form the whole or part of an HTTP response. Various web template systems, web content management systems, and web frameworks exist which can be employed to orchestrate or facilitate the generation of that response. Additionally, PHP can be used for many programming tasks outside of the web context, such as standalone graphical applications and robotic drone control. PHP code can also be directly executed from the command line.",
        "Ruby is an interpreted, high-level, general-purpose programming language. It was designed and developed in the mid-1990s by Yukihiro \"Matz\" Matsumoto in Japan. Ruby is dynamically typed and uses garbage collection and just-in-time compilation. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. According to the creator, Ruby was influenced by Perl, Smalltalk, Eiffel, Ada, BASIC, and Lisp. The name \"Ruby\" originated during an online chat session between Matsumoto and Keiju Ishitsuka on February 24, 1993, before any code had been written for the language. Initially two names were proposed: \"Coral\" and \"Ruby\". Matsumoto chose the latter in a later e-mail to Ishitsuka. Matsumoto later noted a factor in choosing the name \"Ruby\" – it was the birthstone of one of his colleagues. ",
        "Go is a statically typed, compiled programming language designed at Google by Robert Griesemer, Rob Pike, and Ken Thompson. Go is syntactically similar to C, but with memory safety, garbage collection, structural typing, and CSP-style concurrency. The language is often referred to as Golang because of its domain name, golang.org, but the proper name is Go. Go was publicly announced in November 2009, and version 1.0 was released in March 2012. Go is widely used in production at Google and in many other organizations and open-source projects.",
        "JavaScript  often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions. Alongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web.Over 97% of websites use it client-side for web page behavior, often incorporating third-party libraries All major web browsers have a dedicated JavaScript engine to execute the code on the user's device.As a multi-paradigm language, JavaScript supports event-driven, functional, and imperative programming styles. It has application programming interfaces (APIs) for working with text, dates, regular expressions, standard data structures, and the Document Object Model (DOM).",
        "C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system. By design, C provides constructs that map efficiently to typical machine instructions. It has found lasting use in applications previously coded in assembly language. Such applications include operating systems and various application software for computer architectures that range from supercomputers to PLCs and embedded systems. \nA successor to the programming language B, C was originally developed at Bell Labs by Dennis Ritchie between 1972 and 1973 to construct utilities running on Unix. It was applied to re-implementing the kernel of the Unix operating system. During the 1980s, C gradually gained popularity. It has become one of the most widely used programming languages, with C compilers from various vendors available for the majority of existing computer architectures and operating systems. C has been standardized by ANSI since 1989 (ANSI C) and by the International Organization for Standardization (ISO).",
        "C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\". The language has expanded significantly over time, and modern C++ now has object-oriented, generic, and functional features in addition to facilities for low-level memory manipulation. It is almost always implemented as a compiled language, and many vendors provide C++ compilers, including the Free Software Foundation, LLVM, Microsoft, Intel, Oracle, and IBM, so it is available on many platforms.C++ was designed with an orientation toward system programming and embedded, resource-constrained software and large systems, with performance, efficiency, and flexibility of use as its design highlights. C++ has also been found useful in many other contexts, with key strengths being software infrastructure and resource-constrained applications, including desktop applications, video games, servers (e.g. e-commerce, web search, or databases), and performance-critical applications (e.g. telephone switches or space probes).",
        "C# is a general-purpose, multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.C# was developed around 2000 by Microsoft as part of its .NET initiative and later approved as an international standard by Ecma (ECMA-334) in 2002 and ISO (ISO/IEC 23270) in 2003. It was designed by Anders Hejlsberg, and its development team is currently led by Mads Torgersen, being one of the programming languages designed for the Common Language Infrastructure (CLI). The most recent version is 9.0, which was released in 2020 in .NET 5.0 and included in Visual Studio 2019 version 16.8. Mono is a free and open-source project to develop a cross-platform compiler and runtime environment (i.e. virtual machine) for the language."
    )

    val listData: ArrayList<Language>
        get() {
            val list = arrayListOf<Language>()
            for (position in languageName.indices) {
                val language = Language()
                language.logo = languageLogo[position]
                language.name = languageName[position]
                language.release = languageRelease[position]
                language.designed = languageDesignedBy[position]
                language.developer = languageDeveloper[position]
                language.website = languageWebsite[position]
                language.description = languageDescription[position]
                list.add(language)
            }
            return list
        }
}