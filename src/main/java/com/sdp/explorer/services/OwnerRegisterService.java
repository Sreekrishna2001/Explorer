package com.sdp.explorer.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sdp.explorer.repositories.*;
import com.sdp.explorer.controllers.*;
import com.sdp.explorer.models.*;

@Service
public class OwnerRegisterService {
    @Autowired
    public RegisterOwnerRepositry r;

    @Autowired
    public OwnerHomestayrepo or;

    public RegisterOwner registerOwner(RegisterOwner a) {
        return r.save(a);
    }
    public ApiResp lognOwner(LoginOwner w){
         RegisterOwner o = r.findByEmail(w.getEmail());
         if(o!=null && o.getPsw().equals(w.getPsw())) return  new ApiResp(200,"success",o);
         return new ApiResp(403,"incorrect credentials",null);
    }
    public  ApiResp homeStaydetails(OwnerHomestayOffer offer){
        OwnerHomestayOffer  s = or.save(offer);
        System.out.println(offer.getHomestayname());
        return  new ApiResp(200,"success",s);
    }

}