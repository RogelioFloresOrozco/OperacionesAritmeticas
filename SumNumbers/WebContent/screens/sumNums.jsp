<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <title>Sum</title>
</head>
<body>
    <header>
        <h1>Sum of two numbers</h1>
    </header>
    <section>
        <form action="../SumServlet" method="POST">
            <p>
                <label for="num1">Number1:</label>
                <input type="text" name="num1" id="num1">
            </p>
            <p>
                <label for="num2">Number2:</label>
                <input type="text" name="num2" id="num2">
            </p>
            <input type="submit" value="Submit">
        </form>
    </section>
    <footer>
        
    </footer>
    
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</body>
</html>