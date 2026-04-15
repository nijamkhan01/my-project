<%@page import="java.util.Date"%>
<header class="continer-fluid ">
            <div class="header-top">
                <div class="container">
                    <div class="row col-det">
                        <div class="col-lg-6 d-none d-lg-block">
                            <ul class="ulleft">
                                <li>
                                    <i class="far fa-envelope"></i>
                                    blooddonation2022@gmail.com
                                    <span>|</span></li>
                                <li padding-left="500px">
                                    <i class="far fa-clock"></i>
                                    <%
                                    Date d=new Date();
                                    out.print(d);
                                    %>
                                    </li>
                            </ul>
                        </div>
                        <div class="col-lg-6 col-md-12">
                            <ul class="ulright">
                                <li style="color:green;">
                                    <i class="fas fa-conact"></i>
                                    8337853350
                                    
                                    <span>|</span></li>
                                <li>
                                    <i class="fas fa-contact"></i>
                                    9732571303</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div id="menu-jk" class="header-bottom">
                <div class="container">
                    <div class="row nav-row">
                        <div class="col-md-3 logo">
                            <img src="assets/images/logo.jpg" alt="">
                        </div>
                        <div class="col-md-9 nav-col">
                            <nav class="navbar navbar-expand-lg navbar-light">

                                <button
                                    class="navbar-toggler"
                                    type="button"
                                    data-toggle="collapse"
                                    data-target="#navbarNav"
                                    aria-controls="navbarNav"
                                    aria-expanded="false"
                                    aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                                <div class="collapse navbar-collapse" id="navbarNav">
                                    <ul class="navbar-nav">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="#">Home
                                            </a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="aboutus.jsp">About Us</a>
                                        </li>
                                       
                                        <li class="nav-item">
                                            <a class="nav-link" href="donor_login.jsp">Donor</a>
                                        </li>
                                         <li class="nav-item">
                                            <a class="nav-link" href="user_login.jsp">User</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="search.jsp">Search</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="contactus.jsp">Contact Us</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        