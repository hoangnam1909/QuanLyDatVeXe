package com.hn.pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-23T21:32:37")
@StaticMetamodel(Candidate.class)
public class Candidate_ { 

    public static volatile SingularAttribute<Candidate, String> languageCertificate;
    public static volatile SingularAttribute<Candidate, String> cv;
    public static volatile CollectionAttribute<Candidate, ApplyJob> applyJobCollection;
    public static volatile SingularAttribute<Candidate, String> majoring;
    public static volatile SingularAttribute<Candidate, String> strengths;
    public static volatile SingularAttribute<Candidate, String> weaknesses;
    public static volatile SingularAttribute<Candidate, String> informaticsCertificate;
    public static volatile SingularAttribute<Candidate, Integer> yearsExperience;
    public static volatile SingularAttribute<Candidate, Integer> id;
    public static volatile SingularAttribute<Candidate, User> user;
    public static volatile SingularAttribute<Candidate, String> majoringDetail;

}