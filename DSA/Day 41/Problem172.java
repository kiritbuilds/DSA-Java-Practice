// Selection Sort

// class Problem172 {
//     void selectionSort(int[] arr) {
//         // code here
//         int n = arr.length;
//         int min_index;
//         for(int i=0; i<n-1; i++){
//             min_index = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[j]<arr[min_index]){
//                     min_index = j;
//                 }
//             }
//             int temp = arr[min_index];
//             arr[min_index] = arr[i];
//             arr[i] = temp;
            
//         }
//     }
// }


package custom;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.*;
import java.io.IOException; import java.sql.*;

public class MovieTag extends TagSupport {
    private String action;
    private String name;
    private String newName;  // Added for modify

    public void setAction(String action) { this.action = action; }
    public void setName(String name) { this.name = name; }
    public void setNewName(String newName) { this.newName = newName; }

    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            Connection con = getConnection();
            if ("add".equalsIgnoreCase(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO movie_tag(name) VALUES (?)");
                ps.setString(1, name); ps.executeUpdate();
                out.println("Movie Added: " + name + "<br>");
            } else if ("delete".equalsIgnoreCase(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM movie_tag WHERE name=?");
                ps.setString(1, name); ps.executeUpdate();
                out.println("Movie Deleted: " + name + "<br>");
            } else if ("view".equalsIgnoreCase(action)) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM movie_tag");
                out.println("<b>Movie List:</b><br>");
                while (rs.next())
                    out.println(rs.getInt("id") + " - " + rs.getString("name") + "<br>");
            } else if ("modify".equalsIgnoreCase(action)) {   // NEWLY ADDED
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE movie_tag SET name=? WHERE name=?");
                ps.setString(1, newName); ps.setString(2, name);
                ps.executeUpdate();
                out.println("Movie Updated: " + name + " -> " + newName + "<br>");
            }
            con.close();
        } catch (Exception e) { throw new JspException(e); }
        return SKIP_BODY;
    }
}

