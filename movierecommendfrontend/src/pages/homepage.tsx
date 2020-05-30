
import React from "react";
import "./homepage/homepage.css";
import Nav from "../components/Nav";

const HomePage: React.FC = () => {
  let storage = window.localStorage;
  return (
    <div className="layout-container">
      <Nav siteName="电影推荐系统" userName={storage.username} />
      
      <div className="mycontainer">
        <h2>数据集总体统计数据</h2>
        <p>平均评分:3.53</p>
        <p>用户平均打分次数：106.04</p>
        <p>电影平均被打分次数：59.45</p>
      </div>

    </div>
  );
};

export default HomePage;
