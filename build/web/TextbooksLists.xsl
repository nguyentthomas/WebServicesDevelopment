<xsl:stylesheet version="1.0" xmlns:uts="http://www.uts.edu.au/31284/wsd-diary" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
   
    <xsl:template match="/">
        <html>
            <head>
            </head>
            <body>
                <table align="center">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>Category</th>
                            <th>Quantity</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:apply-templates />
                    </tbody>
                </table>  
            </body>
        </html>
    </xsl:template>
   
    <xsl:template match="uts:Textbooks">
        <tr>
            <xsl:apply-templates select="uts:title|uts:author|uts:category|uts:number"/>
        </tr>
    </xsl:template>
   
    <xsl:template match="uts:Textbooks/uts:author|uts:category|uts:number">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    
    <xsl:template match="uts:Textbooks/uts:title">
        <td>
            <a href="BookDetailPage.jsp?title={title}&amp;author={sauthor}&amp;category={category}&amp;abstract={abstract}&amp;condition={condition}&amp;ISBN={ISBN}&amp;yearofPublication={yearofPublication}&amp;publisher={publisher}&amp;lister={lister}"><xsl:apply-templates/></a>
        </td>    
    </xsl:template>
    
    
   
</xsl:stylesheet>
