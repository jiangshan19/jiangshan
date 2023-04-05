package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComBean
{
    private List list;
    private ResultSet rs = null;
    private int EVERYPAGENUM = 2;
    private int count = -1;
    private int qq = 0;

    public void setEVERYPAGENUM(int EVERYPAGENUM)
    {
        this.EVERYPAGENUM = EVERYPAGENUM;
    }

    public int getMessageCount(String sql)
    {
        JDBCUtil dbo = new JDBCUtil();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            this.rs.next();
            this.count = this.rs.getInt(1);
            return this.count;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
            return -1;
        }
        finally
        {
            dbo.close();
        }
    }

    public int getPageCount()
    {
        if (this.count % this.EVERYPAGENUM == 0) {
            return this.count / this.EVERYPAGENUM;
        }
        return this.count / this.EVERYPAGENUM + 1;
    }

    public List getMessage(int page, String sql2, int rr)
    {
        JDBCUtil dbo = new JDBCUtil();
        dbo.open();
        List list = new ArrayList();
        try
        {
            this.rs = dbo.executeQuery(sql2);
            for (int i = 0; i < (page - 1) * this.EVERYPAGENUM; i++) {
                this.rs.next();
            }
            for (int t = 0; t < this.EVERYPAGENUM; t++)
            {
                if (!this.rs.next()) {
                    break;
                }
                this.qq += 1;
                List list2 = new ArrayList();
                for (int cc = 1; cc <= rr; cc++) {
                    list2.add(this.rs.getString(cc));
                }
                list.add(list2);
            }
            return list;
        }
        catch (SQLException ex)
        {
            List localList1;
            ex.printStackTrace();
            return list;
        }
        finally
        {
            dbo.close();
        }
    }

    public int comUp(String sql)
    {
        JDBCUtil dbo = new JDBCUtil();
        dbo.open();
        try
        {
            int i = dbo.executeUpdate(sql);
            if (i == 1) {
                return 1;
            }
            return 4;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 4;
        }
        finally
        {
            dbo.close();
        }
    }

    public List getCom(String sql, int row)
    {
        JDBCUtil dbo = new JDBCUtil();
        this.list = new ArrayList();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            while (this.rs.next())
            {
                List list2 = new ArrayList();
                for (int i = 1; i <= row; i++) {
                    list2.add(this.rs.getString(i));
                }
                this.list.add(list2);
            }
            return this.list;
        }
        catch (Exception e)
        {
            List localList1;
            e.printStackTrace();
            return this.list;
        }
        finally
        {
            dbo.close();
        }
    }

    public List get1Com(String sql, int row)
    {
        JDBCUtil dbo = new JDBCUtil();
        this.list = new ArrayList();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            if (this.rs.next()) {
                for (int i = 1; i <= row; i++) {
                    this.list.add(this.rs.getString(i));
                }
            }
            return this.list;
        }
        catch (Exception e)
        {
            List localList;
            e.printStackTrace();
            return this.list;
        }
        finally
        {
            dbo.close();
        }
    }

    public String getString(String sql)
    {
        JDBCUtil dbo = new JDBCUtil();
        this.list = new ArrayList();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            if (this.rs.next()) {
                return this.rs.getString(1);
            }
            return null;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
        finally
        {
            dbo.close();
        }
    }

    public int getCount(String sql)
    {
        JDBCUtil dbo = new JDBCUtil();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            this.rs.next();
            return this.rs.getInt(1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        finally
        {
            dbo.close();
        }
    }

    public float getFloat(String sql)
    {
        JDBCUtil dbo = new JDBCUtil();
        dbo.open();
        try
        {
            this.rs = dbo.executeQuery(sql);
            this.rs.next();
            return this.rs.getInt(1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0.0F;
        }
        finally
        {
            dbo.close();
        }
    }
}
