imp maximo/maximo@127.0.0.1:1521/maxpro  fromuser=maximo touser=maximo  file=/home/oracle/work.dmp buffer=40960000


select (select count(1) from WORKREPORT) as WORKREPORT,
       (select count(1) from WORKREPORTLINE) as WORKREPORTLINE
  from dual;




select distinct(t.cutype) from WORKREPORT t;--2
select distinct(t.cudept) from WORKREPORT t;
select distinct(t.createname) from WORKREPORT t;
select distinct(t.yard) from WORKREPORT t;
select distinct(t.profession) from WORKREPORT t;
select t.profession,count(1) from WORKREPORT t group by  t.profession order by count(1) desc

select distinct(t.year) from WORKREPORT t;
select distinct(t.week) from WORKREPORT t;

select distinct(t.projectid) from WORKREPORTLINE t;



create view  V1 as
select x.*, rownum rn
  from (select projectname, sum(acturalhours) as sumhours
          from (select t1.projectname, t2.acturalhours
                  from workproperites t1, WORKREPORTLINE t2
                 where t1.projectid = t2.projectid)
         group by projectname
         order by projectname) x;


create or replace view V2 as (
select u1.*, nvl(u2.sumperson, 0) as sumcadre ,nvl( u1.SUMHOURS / u1.workdate / u2.sumperson,0) as deptload
  from (select x."CUDEPT", x."SUMHOURS", 40 as workdate, rownum rn
          from (select t.cudept as cudept, sum(t.acturalhours) as sumhours
                  from WORKREPORT t
                 group by t.cudept
                having length(t.cudept) > 3) x) u1,

       (select t.cudept as cudept,
               count(distinct(t.createname)) as sumperson
          from WORKREPORT t
         where t.profession in
               (select profession
                  from (select t.profession, count(1)
                          from WORKREPORT t
                         group by t.profession
                        having count(1) < 1300))
         group by t.cudept
        having length(t.cudept) > 3) u2
 where u1.cudept = u2.cudept(+) )

create view V1_click as (
select x.*, rownum rn
  from (select projectname, cudept, sum(acturalhours) as sumhours
          from (select t1.projectname, t2.acturalhours, t3.cudept
                  from workproperites t1, WORKREPORTLINE t2, WORKREPORT t3
                 where t1.projectid = t2.projectid
                   and t2.workreportlineid = t3.wrnum)
         group by projectname, cudept
        having length(cudept) > 3
         order by projectname) x)