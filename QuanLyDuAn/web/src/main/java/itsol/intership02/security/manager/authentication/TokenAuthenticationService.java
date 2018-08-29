package itsol.intership02.security.manager.authentication;

/**
 * Created by nhs3108 on 29/03/2017.
 */

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class TokenAuthenticationService {
    private final long EXPIRATIONTIME = 864_000_000; // 10 days
    private final String SECRET = "ThisIsASecret";
    private final String TOKEN_PREFIX = "Bearer";
    private final String HEADER_STRING = "Authorization";


    public  void addAuthentication(HttpServletResponse res,  Authentication authResult) {

        String JWT = Jwts.builder()
                .setSubject(authResult.getName())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();

        res.addHeader("Access-Control-Allow-Origin","*");
        res.addHeader("Access-Control-Allow-Headers","Authorization,timezone,Content-Type, X-CSRF-Token, X-Requested-With, Accept, Accept-Version, Content-Length, Content-MD5, Date, X-Api-Version, X-File-Name");
        res.addHeader("Access-Control-Allow-Methods","GET, POST, PUT, DELETE");
        res.addHeader("Access-Control-Expose-Headers","Access-Control-*,Authorization,ROLE");
        res.addHeader("Allow", "GET, POST, PUT, DELETE");
        res.addHeader("nguyen","ok");
        res.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
        res.addHeader("ROLE", authResult.getAuthorities().toString());

    }

    public  Authentication getAuthentication(HttpServletRequest request,ApplicationContext applicationContext) {

        UserDetailsService userDetailsService = applicationContext.getBean(CustomUserDetailsService.class);


        String token = request.getHeader(HEADER_STRING);

        if (token != null) {
            // parse the token.
            String user = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody()
                    .getSubject();


            return user != null ?
                    new UsernamePasswordAuthenticationToken
                            (user,null,userDetailsService.loadUserByUsername(user).getAuthorities()):
                    null;
        }
        return null;
    }


}