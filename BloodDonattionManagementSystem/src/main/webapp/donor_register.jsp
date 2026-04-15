<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Donor Registration</title>
    <link rel="shortcut icon" href="assets/images/fav.png" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css?family=Merriweather&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="assets/images/fav.jpg">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/fontawsom-all.min.css">
    <link rel="stylesheet" href="assets/plugins/grid-gallery/css/grid-gallery.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css" />
</head>

<body>
        <jsp:include page="header.jsp"></jsp:include>
        
          <!--*************** Footer  Starts Here *************** -->
     <form action="Donor_RegistrationServlet" class = "product-form" method="post">
    <footer id="contact" class="container-fluid">
        <div class="container">
            
            <div class="row content-ro">
                  <div class="col-lg-12 col-md-12 footer-form" style="padding-top:100px">
                    <div class="form-card">
                        <div class="form-title">
                            <h4>Donor Registration</h4>
                        </div>
                        <div class="form-body">
                           <div class="row">
                           <div class="col">
                           <input type="email" placeholder="Enter Email Address" class="form-control">
                           </div>
                           <div class="col">
                           <input type="password" placeholder="Enter Password" class="form-control">  
                           </div>
                            <div class="col">
                           <input type="text" placeholder="Enter Name" class="form-control">
                           </div>
                           </div>
                           
                            <div class="row">
                            <div class="col">
                           <input type="number" placeholder="Enter Conatct Number" class="form-control">
                           </div>
                            <div class="col">
                           <input type="text" placeholder="Enter Address" class="form-control">
                           </div>
                            <div class="col">
                           <select class="form-control" id="State" placeholder="Enter State">
                           <option>Select State</option>
                            <option>West Bengal</option>
                           <option>Bihar</option>
                           <option>Others</option>
                           </select>
                           </div>
                           </div>
                           
                           <div class="row">
                            <div class="col">
                           <input type="text" placeholder="Enter City" class="form-control">
                           </div>
                           
                            <div class="col">
                            <input type="number" placeholder="Enter Pin" class="form-control">
                           </div>
                            <div class="col">
                           <input type="text" placeholder="Enter Blood Group" class="form-control">
                           </div>  
                        </div> 
                                                
                            <button class="btn btn-sm btn-primary w-100">Submit</button>
                           <h5 style="color:blue"> Already Register?<a href="donor_login.jsp">Login Here</a></h5>
                        </div>
                    </div>
                </div>
            </div>
            
                <div class="col-lg-4 col-md-12 footer-links">
                </div>
                
              
            <div class="footer-copy">
                <div class="row">
                    <div class="col-lg-8 col-md-6">
                        <p>Copyright © <a href="https://www.smarteyeapps.com">Smarteyeapps.com</a> | All right reserved.</p>
                    </div>
                    <div class="col-lg-4 col-md-6 socila-link">
                        <ul>
                            <li><a><i class="fab fa-github"></i></a></li>
                            <li><a><i class="fab fa-google-plus-g"></i></a></li>
                            <li><a><i class="fab fa-pinterest-p"></i></a></li>
                            <li><a><i class="fab fa-twitter"></i></a></li>
                            <li><a><i class="fab fa-facebook-f"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    </form>
</body>

    <script src="assets/js/jquery-3.2.1.min.js"></script>
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/plugins/grid-gallery/js/grid-gallery.min.js"></script>
    <script src="assets/plugins/scroll-fixed/jquery-scrolltofixed-min.js"></script>
    <script src="assets/js/script.js"></script>
</html>
