-- MySQL dump 10.13  Distrib 5.7.16, for Win64 (x86_64)
--
-- Host: localhost    Database: blog
-- ------------------------------------------------------
-- Server version	5.7.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES gbk */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(5535) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `editer` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `count1` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `notice` varchar(255) DEFAULT NULL,
  `keywords` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
insert into category (name) values 
('ǰ��');
INSERT INTO articletype (name,category) values
('html5','ǰ��'),
('css3','ǰ��'),
('js','ǰ��'),
('javascript','ǰ��'),
('�ĵñʼ�','ǰ��');



INSERT INTO `article` (id,title,content,indeximg,editor,type,keyword,viewcount,time,detail) VALUES 
(2,'�����ͣͼƬ������css3Ч��','<p><span style=\"color:rgb(102, 102, 102); font-family:����,arial,helvetica,sans-serif; font-size:14px\">&nbsp; &nbsp; ��ʵ������Ч��Ҳ�ܳ�����������ƽʱ�õ����٣���������վ����������Ч������һ��Ӧ���ǲ鿴Դ���룬������ô���õģ�������˺ܶ��div������Ҫ������js��ʵ�֡�Ŀǰ�ܶ������Ҳ������css3�����ԣ�������ӾͿ���ʹ��rgba(0,0,0,0.5)��opacity����Ȼ�ؼ�ҲҪ����ô��λ�����ǻ��õ�position���ԡ�</span></p>\r\n\r\n<p><span style=\"color:rgb(102, 102, 102); font-family:����,arial,helvetica,sans-serif; font-size:14px\">&nbsp;&nbsp;&nbsp;</span></p>\r\n\r\n<p>Html��</p>\r\n\r\n<div class=\"shili\" style=\"margin: 0px; padding: 10px; background-color: rgb(245, 245, 245); border: 1px dotted rgb(119, 136, 85); word-wrap: break-word;\">\r\n<p>&nbsp;&lt;div&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;h2&gt;1�������ͣͼƬ���������ʧ&lt;/h2&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;ul class=&quot;ex01&quot;&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot; &gt;&lt;img src=&quot;images/1.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot; &gt;&lt;img src=&quot;images/2.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot;&gt;&lt;img src=&quot;images/3.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot; &gt;&lt;img src=&quot;images/4.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;/ul&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp;&lt;h2&gt;2�������ͣ���ֳ���&lt;/h2&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;ul class=&quot;ex02&quot;&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot; &gt;&lt;img src=&quot;images/1.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot;&gt;&lt;img src=&quot;images/2.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot;&gt;&lt;img src=&quot;images/3.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;li&gt;&lt;a href=&quot;/&quot;&gt;&lt;img src=&quot;images/4.jpg&quot;&gt;&lt;span&gt;�����ͣ&lt;/span&gt;&lt;/a&gt;&lt;/li&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;/ul&gt;</p>\r\n\r\n<p>&nbsp; &lt;/div&gt;</p>\r\n</div>\r\n\r\n<p>CSS����Ƭ�Σ�</p>\r\n\r\n<div class=\"shili\" style=\"margin: 0px; padding: 10px; background-color: rgb(245, 245, 245); border: 1px dotted rgb(119, 136, 85); word-wrap: break-word;\">\r\n<p>/* ex01 */</p>\r\n\r\n<p>.ex01 li{ width:170px; float:left; margin:5px}</p>\r\n\r\n<p>.ex01 li a { position:relative; display:block }</p>\r\n\r\n<p>.ex01 li span{ position: absolute; left: 0px; bottom: 0px;color:#FFF; line-height:24px; display:block; width:170px; -webkit-transition: all 0.5s; -moz-transition: all 0.5s; -o-transition: all 0.5s; -ms-transition: all 0.5s; background:rgba(0,0,0,0.5); text-align:center}</p>\r\n\r\n<p>.ex01 img { width: 170px; height: 120px; -webkit-transition: all 0.5s; -moz-transition: all 0.5s; -o-transition: all 0.5s; display:block}</p>\r\n\r\n<p>.ex01 img:hover { -webkit-transform: scale(1.1); -moz-transform: scale(1.1); -o-transform: scale(1.1); -ms-transform: scale(1.1); }</p>\r\n\r\n<p>.ex01 li:hover span{ opacity:0}</p>\r\n\r\n<p>/* ex02 */</p>\r\n\r\n<p>.ex02 li{width:170px;margin:5px;float:left;}</p>\r\n\r\n<p>.ex02 li img{width: 170px; height: 120px;display:block;}</p>\r\n\r\n<p>.ex02 li span{ opacity:0}</p>\r\n\r\n<p>.ex02 li:hover span{ opacity:1}</p>\r\n\r\n<p>.ex02 li a { position:relative; display:block }</p>\r\n\r\n<p>.ex02 li span{ position: absolute; left: 0px; top: 0px; background:rgba(0,0,0,0.5); color:#FFF; line-height:24px; display:block; width:170px;text-align:center;-webkit-transition: all 0.5s; -moz-transition: all 0.5s; -o-transition: all 0.5s; -ms-transition: all 0.5s; }</p>\r\n</div>\r\n\r\n<ul>\r\n</ul>\r\n','image_upload/file_1398842463989.jpg','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�'),
(3,'����Ӱ��Ʒ�л�ȡ��ҳ��ɫ���似��','<p>&nbsp; &nbsp; �һ����վ����Ȼ���ֵ�һ����ɫ��Ρ�����ɫ�Ĵ������û��Ӿ�������ȷʵ����Ҫ��Ԫ�ء���ҳ��ɫ��Ҳ��������վ����Ĺؼ�֮һ����Ϊһ�����㡢רҵ����ҳ���ʦ������Ҫ�˽������ɫ���������Լ���ͬ������վ���õ�ɫ�ʴ��䡣ɫ�ʴ��俴�Ƹ���,���������ء�һ����˵,��ҳ�ı���ɫӦ�����һЩ����һЩ����һЩ,��������ɫ������,ʹ�˿�������Ȼ���泩��ɫ�����˵��Ӿ������еĶ�������ҳ��ɫ�ʴ���úã����Խ��������ﵽ�°빦����Ч����</p>\r\n\r\n<p><strong>��ɫ���䳣ʶ��</strong></p>\r\n\r\n<p>1.��ҳ��ɫ�ʵı��ʹ��������ɫ������(R)����(G)����(B)����ͨ����˵��RGBɫ�ʣ�����������������֪��������ɫ����ҳ�б����ɫ���£���ɫΪ����RGB��ʽ����ɫ��(255,0,0) ��ʮ������hex��ʽΪ(FF0000)��</p>\r\n\r\n<p>2.��ɫ�ʰ�&quot;��-&gt;��-&gt;��-&gt;��-&gt;��&quot;���ι��Ƚ���ɵõ�12ɫ�����죬�Ⱥ죬�ȣ��Ȼƣ��ƣ����̣��̣����̣��������ϣ��ϣ��Ϻ졣</p>\r\n\r\n<p>3.��ɫ�ַǲ�ɫ�Ͳ�ɫ���ࡣ�ǲ�ɫ��ָ�ڣ��ף���ϵͳɫ����ɫ��ָ���˷ǲ�ɫ���������ɫ�ʡ�ͨ�����������÷ǲ�ɫ(��ɫ)���߿򣬱�����ͼƬ�ò�ɫ�����Լ�ʹҳ��ḻ����������Ȼ�����ۻ�,ͨ�����������ݶԱ�Ҫ��</p>\r\n\r\n<p><strong>ɫ�ʵ�����о�</strong></p>\r\n\r\n<p>��ɫ---��һ�ּ��ܵ�ɫ�ʡ��̼�Ч������ʹ�˲����嶯����ŭ�����飬�����ĸо���</p>\r\n\r\n<p>��ɫ---������ů����ɫ�ʵ��м䣬�Եú�������������������ȫ�ĸо��� ���ͽ�ƣ����״��䣬���Բ������ţ����ʵ����ա�</p>\r\n\r\n<p>��ɫ---Ҳ��һ�ּ��ܵ�ɫ�ʣ�������죬���������ң���ܰ��ʱ�е�Ч����</p>\r\n\r\n<p>��ɫ---���п��֣�ϣ�����ǻۺ����ĸ��ԣ�����������ߡ�</p>\r\n\r\n<p>��ɫ---�������ˬ�����£�רҵ��ɫ�ʡ����Ͱ�ɫ��ϣ���������˳�����ţ����������ա�</p>\r\n\r\n<p>��ɫ---���н�ף����죬���棬���ĸ��ܡ�</p>\r\n\r\n<p>��ɫ---������������أ��ž���������ѹ�ֵĸ��ܡ�</p>\r\n\r\n<p>��ɫ---������ӹ��ƽ�����ºͣ�ǫ�ã������͸��ŵĸо���</p>\r\n\r\n<p><strong>��ҳ��ɫ�ɻ�</strong></p>\r\n\r\n<p>1.��Ҫ��������ɫ���õ�����������������ɫ�����ڡ�</p>\r\n\r\n<p>2.������ǰ�ĵĶԱȾ���Ҫ��(���Բ�Ҫ�û��Ʒ�����ͼ��������)���Ա�ͻ����Ҫ��������</p>\r\n\r\n<p><strong>��Ӱ��Ʒ����ȡ��ɫ</strong></p>\r\n\r\n<p>��ҳ�б���ͼƬҲ��������Ҫ�ģ�ʹ��һ�Ŵ�ͼƬ��Ϊ��ҳ�ı����������ÿ��������ݵķ������������ľ�����Ƭ�ͳ�������ͼƬ�ܹ�����վ����۴�ȥ��̵�Ӱ�졣ͼƬ���ɫ������������������</p>\r\n\r\n<ul>\r\n</ul>\r\n','image_upload/file_1398842746601.jpg','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�'),
(4,'HTML5�������ƶ��ƶ���������','<p>&nbsp; &nbsp; �����������ս�����Ľ��죬��������ֻ���ƽ������Լ�PC�ն˵�HTML5�����޿���������ơ�ҵ����ʿ�����ƣ�HTML5��Ϊ�ƶ����������������������ƶ��ƶ��������</p>\r\n\r\n<p>HTML5����ص㣺��ƽ̨</p>\r\n\r\n<p>����ʱ�����������ܽ���˵��HTML5�����ǰ���HTML��CSS��JavaScript���ڵ�һ�׼�����ϣ��ɹȸ衢ƻ���ȼ��ټҹ�˾һ�𿪷�����ͼ��Web����һ�������Ӧ��ƽ̨������Ϊ��HTML5�����ص���ǿ�ƽ̨��һ��HTML5��Ϸ��������ʱ������κ�֧��HTML5������������С�</p>\r\n\r\n<p>���ܱ�ʾ��HTML5�ĳ��֣����׸ı���Web��ҳ�ĳ��ַ�ʽ��Ϊ�ƶ������������˼���������������Ϸ����Ƶ�����֡��Ķ���������Ӧ�ã���HTML5��֧���£����������������ӵ�и��á�����ݵ�ʹ�����顣������΢����΢������ͨ������һ�����ӣ��Ϳ����ú������̽�����Ϸ����Щ��ԭ����Ϸ�������ġ�</p>\r\n\r\n<p>����ϣ�ҵ����ʿ�����ƣ�HTML5���Ѿ�Ϯ������������ƶ��������ķ�չ���𵽷ǳ�����������á�2013�꣬�ȸ跢����Androidƽ̨�°�ChromeBeta֧��HTML5��360������ȫ���ƶ�HTML5��չ���ռ������ǡ����ˡ�Ħ����������������ֻ���֧��HTML5Ӧ�á�</p>\r\n\r\n<p>������ʾ��2013��ȫ����10���ֻ������֧��HTML5��ͬʱ��HTML Web�������������ﵽ200�򡣺������ʣ�HTML5��δ��5-10�������ɻ����ƶ�����������������ߡ�ͬʱ��HTML5������׼�ķ�չ���ռ���ζ�������Ͻ����ֹ��ܸ�ǿ�󡢸��ȶ�������Ӧ�á�</p>\r\n\r\n<ul>\r\n</ul>\r\n','image_upload/file_1398842886496.jpg','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�'),
(5,'css3����3Dͼ�鷭ҳЧ��','<p><span style=\"color:rgb(102, 102, 102); font-family:����,arial,helvetica,sans-serif; font-size:14px\">&nbsp; &nbsp; �������ã�������3DЧ�����ӱ��棬perspective�������Ժ���Ԫ�ػ���͸��Ч����������Ԫ�ر���transform-style:preserve-3d����3Dλ�á�����CSS3 perspective ���������Լ��̳̣���ο�</span><a href=\"http://www.w3school.com.cn/cssref/pr_perspective.asp\" style=\"margin: 0px; padding: 0px; text-decoration: none; color: rgb(51, 51, 51); font-family: ����, Arial, Helvetica, sans-serif; font-size: 14px; line-height: 28px; text-indent: 28px;\" target=\"_blank\"><span style=\"color:rgb(0, 0, 0)\">W3School��վ�̳�</span></a></p>\r\n','image_upload/file_1398842990018.jpg','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�'),
(6,'ʹ��css3αԪ������ʱ���Ტ��ʵ�����ѡ�и���Ч��','<p>����css3������ʱ�����֪ʶҪ�㣺αԪ�أ��Լ������αԪ�������êα��</p>\r\n\r\n<p>1��<strong>::before</strong> ��Ԫ��֮ǰ������ݡ�</p>\r\n\r\n<p>2��<strong>::after</strong> ��Ԫ��֮��������ݡ�</p>\r\n\r\n<p>��ʾ�����д�� :before :after&nbsp;CSS3��α����ѡ���ǰ��ĵ���ð��(:)�޸�Ϊ˫ð��(::)��������α��ѡ���������ǰ��д����Ȼ��Ч��</p>\r\n\r\n<p>����������ұ�������ɫ���ߣ����Կ������ұ߿�Ҳ������αԪ��after����beforeʵ�֣����Է����кܶ࣬�����ֻ��Ϊһ�ֲο����������и��õ�д��</p>\r\n\r\n<p><strong>ʹ�÷�����</strong></p>\r\n\r\n<p>p::before { content: &quot; &quot;; }&nbsp;<span style=\"font-size:12px\"><span style=\"color:rgb(128, 128, 128)\">/*��pԪ��ǰ������� */</span></span></p>\r\n\r\n<p><strong>html���룺</strong></p>\r\n\r\n<div class=\"shili\" style=\"margin: 0px; padding: 10px; background-color: rgb(245, 245, 245); border: 1px dotted rgb(119, 136, 85); word-wrap: break-word;\">\r\n<p>&lt;div class=&quot;blogs&quot;&gt;</p>\r\n\r\n<p>&nbsp; &lt;div class=&quot;bloglist&quot;&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;h2&gt;&lt;a href=&quot;/&quot; target=&quot;_blank&quot;&gt;��ϣ���ҵİ�����������&lt;/a&gt;&lt;/h2&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;ul&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;a href=&quot;/&quot;&gt;&lt;img src=&quot;/web/24/images/s1.jpg&quot;&gt;&lt;/a&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &lt;p&gt; ��ϣ���ҵİ����������ģ������ĭ���ٰ���ü��ƽ����ˮ�������������ҵ���������������һ���������������������ӣ������ӵ�ĸ�ף�Ϊ��������ϴ�·�����һ�ŵ��˵�Ŧ�ۡ�Ȼ������һ����ʱ���б��ϡ�&lt;/p&gt;</p>\r\n\r\n<p>&nbsp; &nbsp; &lt;/ul&gt;</p>\r\n\r\n<p>&nbsp; &lt;/div&gt;</p>\r\n\r\n<p>&lt;/div&gt;</p>\r\n</div>\r\n\r\n<p><strong>��ҪCSS���룺</strong></p>\r\n\r\n<div class=\"shili\" style=\"margin: 0px; padding: 10px; background-color: rgb(245, 245, 245); border: 1px dotted rgb(119, 136, 85); word-wrap: break-word;\">\r\n<p>.blogs { width: 670px; margin: 20px auto; position: relative; }</p>\r\n\r\n<p>.blogs<strong>::before</strong>&nbsp;{ content: &quot;&quot;; width: 2px; height: 100%; top: 0; bottom: 0; right: 0; background: #000; position: absolute }&nbsp;<span style=\"color:rgb(128, 128, 128)\"><span style=\"font-size:12px\">/* �Ҳ�ĺ�ɫ������ */</span></span></p>\r\n\r\n<p>.bloglist { background: #222; box-shadow: 0px 1px 0px rgba(255,255,255,.1), inset 0px 1px 1px rgba(0,0,0,.7); width: 630px; color: #b9b9b9; border-radius: 6px; }</p>\r\n\r\n<p>.bloglist<strong>::before</strong>&nbsp;{ content: &quot;&quot;; width: 0px; height: 0px; border-style: solid; border-width: 0px 0 20px 22px; border-color: transparent transparent transparent #111; position: absolute; left: 630px; top: 40px; }<span style=\"color:rgb(128, 128, 128)\"><span style=\"font-size:12px\">/* ������ */</span></span></p>\r\n\r\n<p>.bloglist:<strong>:after&nbsp;</strong>{ content: &quot;&quot;; width: 10px; height: 10px; border-radius: 50%; position: absolute; left: 662px; top: 36px; background: #000; border: 2px solid #333; z-index: 10; }<span style=\"color:rgb(128, 128, 128)\"><span style=\"font-size:12px\">/* Բ�� */</span></span></p>\r\n\r\n<p>.bloglist<span style=\"color:rgb(255, 0, 0)\">:hover</span><strong>::afte</strong>r { border-color: #ccc; }<span style=\"font-size:12px\"><span style=\"color:rgb(128, 128, 128)\">/* ������ȥ Բ�α߿��ɫ */</span></span></p>\r\n</div>\r\n\r\n<ul>\r\n</ul>\r\n\r\n<ul>\r\n</ul>\r\n','image_upload/file_1398843120275.jpg','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�'),
(7,'CSS3����_liffect effect','<p><span style=\"color:rgb(117, 111, 113); font-family:����,arial,helvetica,sans-serif; font-size:12px\">css3��animation���������ǲ���������javaScript�Ľű�����ʵ��һЩ����Ч������������Ե�������ʱ�����ƻ�����Ҫ��ʱ��ȥ���Եģ�liffect effect����˵��һ��css3 animation�Ķ����⣬���溭����20���ֶ���Ч��������������jQuery Easing Plugin�е�Ч����</span></p>\r\n\r\n<ul>\r\n</ul>\r\n','image_upload/file_1398843318250.png','harry','�ĵñʼ�','recommendArticles',6,'2017-06-24 10:20:20','�ĵñʼ�');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-24 10:57:04
