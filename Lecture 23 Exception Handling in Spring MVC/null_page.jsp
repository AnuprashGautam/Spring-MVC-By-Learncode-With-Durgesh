<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
            color: #721c24;
            text-align: center;
            padding: 50px;
        }
        .error-container {
            border: 1px solid #f5c6cb;
            background-color: #f8d7da;
            padding: 20px;
            border-radius: 10px;
        }
        .error-container h2 {
            font-size: 24px;
        }
        .error-container p {
            font-size: 18px;
        }
        .back-home {
            margin-top: 20px;
            padding: 10px 15px;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .back-home:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="error-container">
        <h2>Something went wrong!</h2>
        <p>An unexpected error occurred while processing your request.</p>
        <p>Error Details: ${msg}</p>
        <a href="index.jsp" class="back-home">Go Back to Home</a>
    </div>

</body>
</html>